(ns ogbe.fulcro.mui.icons.close-fullscreen-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CloseFullscreenSharp" :default CloseFullscreenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-fullscreen-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseFullscreenSharp)))