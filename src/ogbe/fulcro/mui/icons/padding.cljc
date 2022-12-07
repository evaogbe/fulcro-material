(ns ogbe.fulcro.mui.icons.padding
  #?(:cljs (:require
            ["@mui/icons-material/Padding" :default Padding]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-padding
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Padding)))