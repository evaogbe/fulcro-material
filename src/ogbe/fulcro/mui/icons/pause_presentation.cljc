(ns ogbe.fulcro.mui.icons.pause-presentation
  #?(:cljs (:require
            ["@mui/icons-material/PausePresentation" :default PausePresentation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-presentation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PausePresentation)))