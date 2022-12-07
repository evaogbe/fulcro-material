(ns ogbe.fulcro.mui.icons.blender
  #?(:cljs (:require
            ["@mui/icons-material/Blender" :default Blender]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blender
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Blender)))