(ns ogbe.fulcro.mui.icons.cancel-presentation
  #?(:cljs (:require
            ["@mui/icons-material/CancelPresentation" :default CancelPresentation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel-presentation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CancelPresentation)))