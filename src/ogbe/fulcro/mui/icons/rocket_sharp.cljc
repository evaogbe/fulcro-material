(ns ogbe.fulcro.mui.icons.rocket-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RocketSharp" :default RocketSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rocket-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RocketSharp)))