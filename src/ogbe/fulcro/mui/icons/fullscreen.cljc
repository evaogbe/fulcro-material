(ns ogbe.fulcro.mui.icons.fullscreen
  #?(:cljs (:require
            ["@mui/icons-material/Fullscreen" :default Fullscreen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fullscreen)))