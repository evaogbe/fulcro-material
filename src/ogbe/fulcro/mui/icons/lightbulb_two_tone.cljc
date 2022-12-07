(ns ogbe.fulcro.mui.icons.lightbulb-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LightbulbTwoTone" :default LightbulbTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lightbulb-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightbulbTwoTone)))