(ns ogbe.fulcro.mui.icons.add-aphoto
  #?(:cljs (:require
            ["@mui/icons-material/AddAPhoto" :default AddAPhoto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-aphoto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddAPhoto)))