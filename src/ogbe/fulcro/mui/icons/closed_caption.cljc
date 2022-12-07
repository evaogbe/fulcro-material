(ns ogbe.fulcro.mui.icons.closed-caption
  #?(:cljs (:require
            ["@mui/icons-material/ClosedCaption" :default ClosedCaption]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-closed-caption
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClosedCaption)))