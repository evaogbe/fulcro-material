(ns ogbe.fulcro.mui.icons.add-home-work
  #?(:cljs (:require
            ["@mui/icons-material/AddHomeWork" :default AddHomeWork]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-home-work
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddHomeWork)))