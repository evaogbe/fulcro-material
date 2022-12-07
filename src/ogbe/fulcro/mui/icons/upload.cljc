(ns ogbe.fulcro.mui.icons.upload
  #?(:cljs (:require
            ["@mui/icons-material/Upload" :default Upload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Upload)))