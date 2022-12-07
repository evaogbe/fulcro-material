(ns ogbe.fulcro.mui.icons.looks-one
  #?(:cljs (:require
            ["@mui/icons-material/LooksOne" :default LooksOne]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-looks-one
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LooksOne)))