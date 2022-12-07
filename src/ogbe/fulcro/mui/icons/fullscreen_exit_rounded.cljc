(ns ogbe.fulcro.mui.icons.fullscreen-exit-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FullscreenExitRounded" :default FullscreenExitRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen-exit-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FullscreenExitRounded)))