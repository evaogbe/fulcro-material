(ns ogbe.fulcro.mui.icons.outbound-outlined
  #?(:cljs (:require
            ["@mui/icons-material/OutboundOutlined" :default OutboundOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbound-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboundOutlined)))