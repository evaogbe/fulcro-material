(ns ogbe.fulcro.mui.icons.list-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ListSharp" :default ListSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-list-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ListSharp)))