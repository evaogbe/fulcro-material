(ns ogbe.fulcro.mui.icons.waves
  #?(:cljs (:require
            ["@mui/icons-material/Waves" :default Waves]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-waves
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Waves)))