(ns ogbe.fulcro.mui.icons.wc-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WcOutlined" :default WcOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wc-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WcOutlined)))