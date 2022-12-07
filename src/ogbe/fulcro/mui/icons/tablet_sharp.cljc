(ns ogbe.fulcro.mui.icons.tablet-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TabletSharp" :default TabletSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabletSharp)))