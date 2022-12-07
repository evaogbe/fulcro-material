(ns ogbe.fulcro.mui.icons.add-ic-call
  #?(:cljs (:require
            ["@mui/icons-material/AddIcCall" :default AddIcCall]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-ic-call
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddIcCall)))