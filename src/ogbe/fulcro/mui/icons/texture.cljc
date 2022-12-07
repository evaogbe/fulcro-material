(ns ogbe.fulcro.mui.icons.texture
  #?(:cljs (:require
            ["@mui/icons-material/Texture" :default Texture]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-texture
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Texture)))