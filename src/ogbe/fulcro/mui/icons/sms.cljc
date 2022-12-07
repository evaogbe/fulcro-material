(ns ogbe.fulcro.mui.icons.sms
  #?(:cljs (:require
            ["@mui/icons-material/Sms" :default Sms]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sms
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sms)))