(ns ogbe.fulcro.mui.icons.phishing
  #?(:cljs (:require
            ["@mui/icons-material/Phishing" :default Phishing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phishing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Phishing)))