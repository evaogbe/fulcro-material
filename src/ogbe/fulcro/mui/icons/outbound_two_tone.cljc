(ns ogbe.fulcro.mui.icons.outbound-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/OutboundTwoTone" :default OutboundTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbound-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboundTwoTone)))