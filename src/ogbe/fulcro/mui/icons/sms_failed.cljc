(ns ogbe.fulcro.mui.icons.sms-failed
  #?(:cljs (:require
            ["@mui/icons-material/SmsFailed" :default SmsFailed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sms-failed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmsFailed)))