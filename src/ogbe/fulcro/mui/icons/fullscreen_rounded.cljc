(ns ogbe.fulcro.mui.icons.fullscreen-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FullscreenRounded" :default FullscreenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FullscreenRounded)))