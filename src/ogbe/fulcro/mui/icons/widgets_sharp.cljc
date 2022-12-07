(ns ogbe.fulcro.mui.icons.widgets-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WidgetsSharp" :default WidgetsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-widgets-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidgetsSharp)))