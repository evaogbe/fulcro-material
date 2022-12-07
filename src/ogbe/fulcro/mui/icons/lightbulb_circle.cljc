(ns ogbe.fulcro.mui.icons.lightbulb-circle
  #?(:cljs (:require
            ["@mui/icons-material/LightbulbCircle" :default LightbulbCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lightbulb-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightbulbCircle)))