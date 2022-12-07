(ns ogbe.fulcro.mui.icons.texture-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TextureSharp" :default TextureSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-texture-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextureSharp)))