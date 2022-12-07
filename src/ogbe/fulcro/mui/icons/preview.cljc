(ns ogbe.fulcro.mui.icons.preview
  #?(:cljs (:require
            ["@mui/icons-material/Preview" :default Preview]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-preview
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Preview)))