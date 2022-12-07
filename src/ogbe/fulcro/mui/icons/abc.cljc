(ns ogbe.fulcro.mui.icons.abc
  #?(:cljs (:require
            ["@mui/icons-material/Abc" :default Abc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-abc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Abc)))