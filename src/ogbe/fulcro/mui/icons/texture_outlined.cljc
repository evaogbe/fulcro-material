(ns ogbe.fulcro.mui.icons.texture-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TextureOutlined" :default TextureOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-texture-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextureOutlined)))