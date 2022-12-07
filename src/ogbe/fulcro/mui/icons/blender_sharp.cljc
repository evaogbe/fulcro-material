(ns ogbe.fulcro.mui.icons.blender-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BlenderSharp" :default BlenderSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blender-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlenderSharp)))