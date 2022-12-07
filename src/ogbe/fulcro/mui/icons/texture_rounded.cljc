(ns ogbe.fulcro.mui.icons.texture-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TextureRounded" :default TextureRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-texture-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextureRounded)))