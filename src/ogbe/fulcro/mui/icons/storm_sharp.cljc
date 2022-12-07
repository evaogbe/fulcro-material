(ns ogbe.fulcro.mui.icons.storm-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StormSharp" :default StormSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storm-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StormSharp)))