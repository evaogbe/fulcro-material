(ns ogbe.fulcro.mui.icons.scale-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScaleSharp" :default ScaleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scale-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScaleSharp)))