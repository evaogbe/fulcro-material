(ns ogbe.fulcro.mui.icons.pending-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PendingOutlined" :default PendingOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingOutlined)))