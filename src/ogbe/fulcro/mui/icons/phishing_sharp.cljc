(ns ogbe.fulcro.mui.icons.phishing-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhishingSharp" :default PhishingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phishing-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhishingSharp)))