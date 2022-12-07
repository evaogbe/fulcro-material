(ns ogbe.fulcro.mui.icons.piano
  #?(:cljs (:require
            ["@mui/icons-material/Piano" :default Piano]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-piano
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Piano)))