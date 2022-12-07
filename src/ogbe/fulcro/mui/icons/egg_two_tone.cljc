(ns ogbe.fulcro.mui.icons.egg-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/EggTwoTone" :default EggTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-egg-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EggTwoTone)))