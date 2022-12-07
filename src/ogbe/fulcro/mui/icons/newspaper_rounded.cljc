(ns ogbe.fulcro.mui.icons.newspaper-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NewspaperRounded" :default NewspaperRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-newspaper-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NewspaperRounded)))