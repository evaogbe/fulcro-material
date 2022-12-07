(ns ogbe.fulcro.mui.icons.create-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CreateRounded" :default CreateRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-create-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreateRounded)))