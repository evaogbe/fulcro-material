(ns ogbe.fulcro.mui.icons.lightbulb-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LightbulbSharp" :default LightbulbSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lightbulb-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightbulbSharp)))