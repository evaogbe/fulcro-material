(ns ogbe.fulcro.mui.icons.fullscreen-exit
  #?(:cljs (:require
            ["@mui/icons-material/FullscreenExit" :default FullscreenExit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen-exit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FullscreenExit)))