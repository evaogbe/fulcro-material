(ns ogbe.fulcro.mui.icons.fullscreen-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FullscreenSharp" :default FullscreenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FullscreenSharp)))