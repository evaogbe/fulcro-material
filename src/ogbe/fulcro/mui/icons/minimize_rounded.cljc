(ns ogbe.fulcro.mui.icons.minimize-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MinimizeRounded" :default MinimizeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-minimize-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MinimizeRounded)))