(ns ogbe.fulcro.mui.icons.looks-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LooksRounded" :default LooksRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-looks-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LooksRounded)))