(ns ogbe.fulcro.mui.icons.tungsten
  #?(:cljs (:require
            ["@mui/icons-material/Tungsten" :default Tungsten]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tungsten
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tungsten)))