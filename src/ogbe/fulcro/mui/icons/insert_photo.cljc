(ns ogbe.fulcro.mui.icons.insert-photo
  #?(:cljs (:require
            ["@mui/icons-material/InsertPhoto" :default InsertPhoto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-photo
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertPhoto)))