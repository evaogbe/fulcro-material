(ns ogbe.fulcro.mui.icons.call-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CallOutlined" :default CallOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallOutlined)))