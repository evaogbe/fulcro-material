(ns ogbe.fulcro.mui.icons.phishing-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PhishingOutlined" :default PhishingOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phishing-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhishingOutlined)))