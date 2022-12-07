(ns ogbe.fulcro.mui.icons.male-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MaleSharp" :default MaleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-male-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MaleSharp)))