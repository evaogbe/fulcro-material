(ns ogbe.fulcro.mui.icons.list-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ListTwoTone" :default ListTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-list-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ListTwoTone)))