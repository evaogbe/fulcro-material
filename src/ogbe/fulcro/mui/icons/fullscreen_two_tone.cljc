(ns ogbe.fulcro.mui.icons.fullscreen-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FullscreenTwoTone" :default FullscreenTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FullscreenTwoTone)))