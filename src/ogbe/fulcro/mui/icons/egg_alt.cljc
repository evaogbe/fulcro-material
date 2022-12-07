(ns ogbe.fulcro.mui.icons.egg-alt
  #?(:cljs (:require
            ["@mui/icons-material/EggAlt" :default EggAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-egg-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EggAlt)))